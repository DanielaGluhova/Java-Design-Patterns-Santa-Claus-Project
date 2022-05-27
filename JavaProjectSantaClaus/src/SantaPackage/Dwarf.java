package SantaPackage;

public class Dwarf {

	private MagicBoard magicBoard = new MagicBoard();

	public void update() {
		System.out.println("Разбрахме, шефе!");
	}
	
	public Factory getToy(String toyType) {
		if(toyType == null) {
			return null;
		}
		if(toyType.equalsIgnoreCase("DOLL")){
		    return new Doll();
		}else if(toyType.equalsIgnoreCase("BIKE")){
		    return new Bike();
		}
		return null;
	}

	public void attachBoard(MagicBoard mB) {
		magicBoard = mB;
	}
}
