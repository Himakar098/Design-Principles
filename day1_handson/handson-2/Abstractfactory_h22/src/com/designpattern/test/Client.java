package com.designpattern.test;

import com.designpattern.Abstractfactory.Factory;
import com.designpattern.factory.AudiFactory;
import com.designpattern.factory.MercedesFactory;
import com.designpattern.interfaces.Headlight;
import com.designpattern.interfaces.Tire;

public class Client {

	public static void main(String[] args) {

		Headlight audi = createHeadlightAndTire(new AudiFactory(15, "Racing", "Blue"));
        audi.printSpecs();
        System.out.println("-------------------------------------------------------------------------------------");
        Headlight mercedes = createHeadlightAndTire(new MercedesFactory(16, "Classic", "White"));
        mercedes.printSpecs();
    }
   
	
	// config method that will create an instance of Processor with passed abstract class object
    public static Headlight createHeadlightAndTire(Factory Factory) {
        Headlight headlight = Factory.makeHeadlight();
        Tire tire = Factory.makeTire();
        headlight.attachTire(tire);
        return headlight;
    
        
	}

}
