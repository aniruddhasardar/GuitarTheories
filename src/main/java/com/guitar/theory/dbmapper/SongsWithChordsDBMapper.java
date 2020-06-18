package com.guitar.theory.dbmapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.guitar.theory.domain.SongsBean;

@Mapper
@Component
public interface SongsWithChordsDBMapper {

	List<SongsBean> getSongsWithChords(SongsBean songsBean);

}
