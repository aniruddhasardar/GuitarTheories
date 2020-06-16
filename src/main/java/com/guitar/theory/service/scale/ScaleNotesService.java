package com.guitar.theory.service.scale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.guitar.theory.util.UtilityConstants;

@Service
public class ScaleNotesService {
	
	LinkedList<String> chromaticScaleNotesList= new LinkedList<>();

	public List<String> getScaleNotesDetails(String scaleName, String scaleType) {	
		List<String> scaleDetails = new ArrayList<>();
		scaleDetails.add(scaleName.toUpperCase());
		String scaleFormula="";
		if(scaleType.equalsIgnoreCase("MAJOR")) {
			scaleFormula=UtilityConstants.FORMULA_MAJOR_SCALE;
		}
		if(scaleType.equalsIgnoreCase("MINOR")) {
			scaleFormula=UtilityConstants.FORMULA_MINOR_SCALE;
		}
		List<String> scaleStepsList=Arrays.asList(scaleFormula.split(""));
		
		String chromaticScale = UtilityConstants.CHROMATIC_SCALE;
		chromaticScaleNotesList = getPropertyValues(chromaticScale, ",");
		int index= 0;
		//chromaticScaleNotesList.indexOf(scaleName);
		arrangeList(scaleName);
		for(String step:scaleStepsList) {
			if (step.equalsIgnoreCase("W"))
				index=index+2;
			if (step.equalsIgnoreCase("H"))
				index=index+1;
			String note = chromaticScaleNotesList.get(index);
			System.out.println(note);
			scaleDetails.add(note);
		}
		
		return scaleDetails;
	}
	 

	private LinkedList<String> getPropertyValues(String values, String delimiter){
		LinkedList<String> chromaticScaleNotesList = new LinkedList<String>();
		String[] valueList = values.split(delimiter);
		for(String arg:valueList) {
			chromaticScaleNotesList.add(arg);
		}
		return chromaticScaleNotesList;
	}
	

	
	public void arrangeList(String elementName) {
		String element="";
		do {
			String ele=chromaticScaleNotesList.getFirst();
			if(ele.equalsIgnoreCase(elementName)) {
				element= ele;
			} else {
				chromaticScaleNotesList.removeFirst();
				chromaticScaleNotesList.addLast(ele);
			}
		} while(!element.equalsIgnoreCase(elementName));
		//To make it a Ashtak
		chromaticScaleNotesList.addLast(elementName);
	}
}
