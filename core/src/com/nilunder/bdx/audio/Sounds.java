package com.nilunder.bdx.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

import com.nilunder.bdx.*;

public class Sounds extends AudioStore<Sound>{

	public Sounds(){
		super("bdx/audio/sounds");
	}

	@Override
	public Sound loadAudio(String fileName){
		return Gdx.audio.newSound(findFile(fileName));
	}
}
