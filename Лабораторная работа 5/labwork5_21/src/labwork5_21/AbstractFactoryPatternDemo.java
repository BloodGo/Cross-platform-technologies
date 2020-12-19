package labwork5_21;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory planeFactory = FactoryProducer.getFactory("Plane");
		Plane plane1 = planeFactory.getPlane("agriculture");
		AbstractFactory plantFactory = FactoryProducer.getFactory("Plant");
		Plant plantA = plantFactory.getPlant("ForAgricultural");
		plantA.build(plane1.fly());
		Plane plane2 = planeFactory.getPlane("ambulance");
		Plant plantB = plantFactory.getPlant("ForAmbulance");
		plantB.build(plane2.fly());
		Plane plane3 = planeFactory.getPlane("scout");
		Plant plantC = plantFactory.getPlant("ForScout");
		plantC.build(plane3.fly());
	}
}
