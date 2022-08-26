package com.test.dynamix.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.test.dynamix.dao.DemandeDao;
import com.test.dynamix.dto.DemandeDevisResponseDto;
import com.test.dynamix.dto.DemandeRequestDto;
import com.test.dynamix.dto.DemandeResponseDto;
import com.test.dynamix.models.DemandeDevisEntity;
import com.test.dynamix.models.DemandeEntity;

@Service
public class DemandeServiceImpl  implements DemandeService {
	
	 private DemandeDao demandeDao;
	 private ModelMapper modelMapper;
	
	  @Autowired
	    public DemandeServiceImpl(DemandeDao demandeDao, ModelMapper modelMapper) {
	        this.demandeDao = demandeDao;
	        this.modelMapper = modelMapper;
	    }

	@Override
	public DemandeResponseDto save(DemandeRequestDto demandeRequestDto) {
		
		DemandeEntity  demandeEntity = modelMapper.map(demandeRequestDto, DemandeEntity.class);
		DemandeEntity demande = demandeDao.save(demandeEntity);
		DemandeResponseDto demandeRes = modelMapper.map(demande , DemandeResponseDto.class );
		return demandeRes;
	}

	@Override
	public DemandeResponseDto findById(Integer id) {
		 DemandeEntity  demandeEntity = demandeDao.findById(id).orElseThrow(() -> new RuntimeException("Demande not found"));
	        return modelMapper.map(demandeEntity, DemandeResponseDto.class);
	}

	@Override
	public void delete(Integer id) {
		demandeDao.deleteById(id);
		
	}

	@Override
	public DemandeResponseDto update(DemandeRequestDto demandeRequestDto, Integer id) throws NotFoundException {
		java.util.Optional<DemandeEntity> demandeEntityOptional = demandeDao.findById(id);
        if (demandeEntityOptional.isPresent()) {
            DemandeEntity demandeEntity = modelMapper.map(demandeRequestDto, DemandeEntity.class);
            demandeEntity.setId(id);
            DemandeEntity updated = demandeDao.save(demandeEntity);
            return modelMapper.map(updated, DemandeResponseDto.class);
        } else {
        	throw new NotFoundException();
        }
	}

	@Override
	public List<DemandeResponseDto> findAll() {
		return demandeDao.findAll()
                .stream().map(el -> modelMapper.map(el, DemandeResponseDto.class))
                .collect(Collectors.toList());
    
	}

	

	

		
	


	
















	





	  

	  

}
