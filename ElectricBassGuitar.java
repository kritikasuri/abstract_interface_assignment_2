package com.acadgild.assignment.abstracts.instrument;

public class ElectricBassGuitar extends StringedInstrument {

	public ElectricBassGuitar(){
		
		this.field_name = "Bass Guitar";
        this.numberOfStrings = 4;		
	}
	
	@Override
	public void play() {
		System.out.println("Its a "+field_name+" of "+numberOfStrings+" strings.");		
	}
}
