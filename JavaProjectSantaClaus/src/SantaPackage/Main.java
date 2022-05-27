package SantaPackage;

public class Main {

	public static void main(String[] args) {

//		SantaClaus s1= new SantaClaus(); 
//		- не може да се създаде инстанция, защото имаме ограничение и вече сме създали една!

//		Проверка дали реално инстанцията която се взима е една и съща
		SantaClaus s2 = SantaClaus.getInstance();
		SantaClaus s3 = SantaClaus.getInstance();
		System.out.println(s2);
		System.out.println(s3);

//		Създаване на обект от тип MagicBoard за да може там да показва 
//		своите команди Дядо Коледа и да бъдат видяни от джуджетата
		MagicBoard magicBoard = new MagicBoard();

//		Създаване на обект от тип Dwarf 
		Dwarf d1 = new Dwarf();
//		Дъската вече ще знае че джудже d1 я наблюдава
		magicBoard.attach(d1);
//		Закачане на наблюдател(джудже) към наблюдавания предмет в случая - магическата дъска
//		за да следи промяната на състоянието й
		d1.attachBoard(magicBoard);


//		Създаване на определен вид команда и избор на дъска за визуализация
		santaNeedsDollCommand iNeedDoll = new santaNeedsDollCommand(magicBoard);
		santaNeedsBikeCommand iNeedBike = new santaNeedsBikeCommand(magicBoard);
		santaDontWantAnythingCommand iDontNeedAnything = new santaDontWantAnythingCommand(magicBoard);

//		Дядо Коледа си избира команди 
		s2.setCommand(iNeedDoll);
		
		s2.setCommand(iNeedBike);

//		Командите се изписват на магическата дъска
		s2.executeOnMagicBoard();

//		Създаване на обект от тип Toy като джуджето взема предвид и типа му (Doll/Bike)
		Factory toy1 = d1.getToy("Doll");
//		Визуализиране на създадения обект 
		toy1.create();
		Factory toy2 = d1.getToy("Bike");
		toy2.create();

		s2.setCommand(iDontNeedAnything);
		s2.executeOnMagicBoard();
	}
}
