package com.guitar.theory.controller.scale;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guitar.theory.service.scale.ChordNotesService;
import com.guitar.theory.service.scale.ScaleNotesService;

@RestController
public class ScaleController {
	@Autowired
	ScaleNotesService scaleNotesService;
	@Autowired
	ChordNotesService chordNotesService;
	
	/**
	 * Calculate the notes for the scale based on the scaleName (eg. C) and scaleType (eg. Major)
	 * and the formulas and the Chromatic scale notes kept in the constant file
	 * @param scaleName
	 * @param scaleType
	 * @return
	 */
	@GetMapping(path="/scale/notes")
	public List<String> getScaleNotes(@RequestParam String scaleName,@RequestParam String scaleType) {
		List<String> scaleDetails = scaleNotesService.getScaleNotesDetails(scaleName,scaleType);
		return scaleDetails;
	}

	/**
	 * Find the notes for the chord
	 * @param scaleName
	 * @param scaleType
	 * @return
	 */
	@GetMapping(path="/chord/notes")
	public List<String> getChordNotes(@RequestParam String scaleName,@RequestParam String scaleType) {
		List<String> scaleDetails = chordNotesService.getChordNotesDetails(scaleName,scaleType);
		return scaleDetails;
	}
}
