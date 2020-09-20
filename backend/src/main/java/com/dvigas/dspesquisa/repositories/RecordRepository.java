package com.dvigas.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvigas.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
