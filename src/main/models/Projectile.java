package main.models;


import main.controllers.ActionPane;

public class Projectile extends TheHord {

	public Projectile(ActionPane stage) {
		super(stage);
		super.up = false;
		bulletSpeed = 1;
	}

	public void collision(GameObject a) {
		if (a instanceof Invader)
			return;
		setMarkedForRemoval(true);
	}
	
}
