package com.acadgild.assignment.abstracts.instrument;

public class ElectricGuitar extends StringedInstrument{
	
	public ElectricGuitar(){
	
		this.field_name = "Guitar";
        this.numberOfStrings = 3;
		
	}

	@Override
	public void play() {
		System.out.println("Its a "+field_name+" of "+numberOfStrings+" strings.");
	}
	
}
