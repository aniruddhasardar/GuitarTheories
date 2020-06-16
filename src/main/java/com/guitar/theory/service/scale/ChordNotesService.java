package com.guitar.theory.service.scale;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ChordNotesService {
	@Autowired
	ScaleNotesService scaleService;
	public List<String> getChordNotesDetails(String scaleName, String scaleType) {
		List<String> allNotesList = scaleService.getScaleNotesDetails(scaleName, scaleType);
		/*
		 * String[] allNotesArr = allNotesList.stream() .toArray(String[]::new);
		 */
		/*
		 * String[] allNotesArr = new String[10]; allNotesList.toArray(allNotesArr);
		 */
		String[] allNotesArr = allNotesList.toArray(new String[0]);
		List<String> evenIndexedNames = IntStream
			      .range(0, allNotesArr.length)
			      .filter(i -> (i ==0 || i==2 || i== 4))
			      .mapToObj(i -> allNotesArr[i])
			      .collect(Collectors.toList());
		return evenIndexedNames;
	}

}
