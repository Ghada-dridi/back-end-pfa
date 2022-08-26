package com.test.dynamix.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.test.dynamix.dao.DemandeDevisDao;
import com.test.dynamix.dto.DemandeDevisRequestDto;
import com.test.dynamix.dto.DemandeDevisResponseDto;
import com.test.dynamix.models.DemandeDevisEntity;






@Service
public class DemandeDevisServiceImpl implements DemandeDevisService {
	 private DemandeDevisDao demandeDevisDao;
	    private ModelMapper modelMapper;

	    @Autowired
	    public DemandeDevisServiceImpl(DemandeDevisDao demandeDevisDao, ModelMapper modelMapper) {
	        this.demandeDevisDao = demandeDevisDao;
	        this.modelMapper = modelMapper;
	    }

	    public DemandeDevisResponseDto save(DemandeDevisRequestDto demandeDevisRequestDto) {
	       DemandeDevisEntity  demandeDevisEntity = modelMapper.map(demandeDevisRequestDto, DemandeDevisEntity.class);
	       DemandeDevisEntity demandedevis = demandeDevisDao.save(demandeDevisEntity);
	       DemandeDevisResponseDto response = modelMapper.map(demandedevis , DemandeDevisResponseDto.class);
	      return response;
	    }

		@Override
		public DemandeDevisResponseDto findById(Integer id) {
			 DemandeDevisEntity  demandeDevisEntity = demandeDevisDao.findById(id).orElseThrow(() -> new RuntimeException("Demande not found"));
		        return modelMapper.map(demandeDevisEntity, DemandeDevisResponseDto.class);
		}

		@Override
		public void delete(Integer id) {
			demandeDevisDao.deleteById(id);
			
		}

		@Override
		public DemandeDevisResponseDto update(DemandeDevisRequestDto demandeDevisRequestDto, Integer id) throws NotFoundException {
			   java.util.Optional<DemandeDevisEntity> demandeDevisEntityOptional = demandeDevisDao.findById(id);
		        if (demandeDevisEntityOptional.isPresent()) {
		            DemandeDevisEntity demandeDevisEntity = modelMapper.map(demandeDevisRequestDto, DemandeDevisEntity.class);
		            demandeDevisEntity.setId(id);
		            DemandeDevisEntity updated = demandeDevisDao.save(demandeDevisEntity);
		            return modelMapper.map(updated, DemandeDevisResponseDto.class);
		        } else {
		        	throw new NotFoundException();
		        }
		            }
		    
		@Override
		public List<DemandeDevisResponseDto> findAll() {
			   return demandeDevisDao.findAll()
		                .stream().map(el -> modelMapper.map(el, DemandeDevisResponseDto.class))
		                .collect(Collectors.toList());
		    
		}


}
