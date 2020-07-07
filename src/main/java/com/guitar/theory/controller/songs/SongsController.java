package com.guitar.theory.controller.songs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guitar.theory.domain.SongsBean;
import com.guitar.theory.service.songs.SongsWithChordsService;
@CrossOrigin(origins = "*")
@RestController
public class SongsController {
	@Autowired
	SongsWithChordsService songsWithChordsService; 
	
	/**
	 * Returns all the songs with chords if the SongsBean isn't passed
	 * Else return the song/songs with chords based on the values passed with SongBean
	 * @param songsBean
	 * @return
	 */
	@RequestMapping(path = "/songs/chords")
	public List<SongsBean> getSongsWithChords(@RequestBody(required = false) SongsBean songsBean){
		List<SongsBean> listOfSongs = songsWithChordsService.getSongsWithChords(songsBean);
		return listOfSongs;
	}
	
	/**
	 * Returns all the songs with tabs if the SongsBean isn't passed
	 * Else return the song/songs with tabs based on the values passed with SongBean
	 * @param songsBean
	 * @return
	 */
	@RequestMapping(path = "/songs/tabs")
	public List<SongsBean> getSongsWithTabs(@RequestBody(required = false) SongsBean songsBean){
		List<SongsBean> listOfSongs = new ArrayList<>();
		
		
		return listOfSongs;
	}
}
