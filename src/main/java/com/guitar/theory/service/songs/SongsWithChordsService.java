package com.guitar.theory.service.songs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guitar.theory.dao.SongsWithChordsDao;
import com.guitar.theory.domain.SongsBean;

@Service
public class SongsWithChordsService {
	@Autowired
	SongsWithChordsDao songsWithChordsDao;

	public List<SongsBean> getSongsWithChords(SongsBean songsBean) {
		List<SongsBean> listOfSongs = new ArrayList<>();

		/*
		 * if (songsBean == null) { songsBean = new SongsBean();
		 * songsBean.setSingerName("Kishore Kumar"); listOfSongs.add(songsBean); }
		 */
		listOfSongs = songsWithChordsDao.getSongsWithChords(songsBean);
		return listOfSongs;
	}
}
