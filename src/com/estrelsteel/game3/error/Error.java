package com.estrelsteel.game3.error;

import com.estrelsteel.game3.block.Image;

public enum Error {
	
	NULL(-1, "NULL", new Image("/com/estrelsteel/game3/res/error/error.png")),
	UNKOWN(0, "???", new Image("/com/estrelsteel/game3/res/error/error.png")),
	WRONG_MAT(1, "WRONG_MATERIAL", new Image("/com/estrelsteel/game3/res/error/errorMaterial.png")),
	MAXED_POW(2, "MAXED_POWER", new Image("/com/estrelsteel/game3/res/error/errorPower.png")),
	TUTORIAL_MOVE(3, "TUTORIAL_MOVE", new Image("/com/estrelsteel/game3/res/error/errorMove.png")),
	TUTORIAL_BEND(4, "TUTORIAL_BEND", new Image("/com/estrelsteel/game3/res/error/errorBend.png")),
	LACK_POW(5, "LACKING_POWER", new Image("/com/estrelsteel/game3/res/error/error.png"));
	
	private int id;
	private String name;
	private Image img;
	
	Error(int id, String name, Image img) {
		this.id = id;
		this.name = name;
		this.img = img;
	}
	
	public int getInt() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Image getImage() {
		return img;
	}
}
