package com.guitar.theory.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guitar.theory.dbmapper.SongsWithChordsDBMapper;
import com.guitar.theory.domain.SongsBean;

@Repository
//@MapperScan("com.guitar.theory.dbmapper")
public class SongsWithChordsDao {
	@Autowired
	private SongsWithChordsDBMapper dbMapper;

	public List<SongsBean> getSongsWithChords(SongsBean songsBean) {
		 
		return dbMapper.getSongsWithChords(songsBean);
	}

}
