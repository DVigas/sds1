package com.dvigas.dspesquisa.services;

import java.time.Instant;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvigas.dspesquisa.dto.RecordDTO;
import com.dvigas.dspesquisa.dto.RecordInsertDTO;
import com.dvigas.dspesquisa.entities.Game;
import com.dvigas.dspesquisa.entities.Record;
import com.dvigas.dspesquisa.repositories.GameRepository;
import com.dvigas.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);		
		return new RecordDTO(entity);
	}

}
