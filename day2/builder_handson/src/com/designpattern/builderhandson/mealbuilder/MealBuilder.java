package com.designpattern.builderhandson.mealbuilder;

import com.designpattern.builderhandson.beans.ChickenBurger;
import com.designpattern.builderhandson.beans.Coke;
import com.designpattern.builderhandson.beans.Pepsi;
import com.designpattern.builderhandson.beans.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
