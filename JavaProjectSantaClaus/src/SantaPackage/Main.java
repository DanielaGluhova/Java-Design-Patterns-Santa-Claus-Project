package SantaPackage;

public class Main {

	public static void main(String[] args) {

//		SantaClaus s1= new SantaClaus(); 
//		- �� ���� �� �� ������� ���������, ������ ����� ����������� � ���� ��� ������� ����!

//		�������� ���� ������ ����������� ����� �� ����� � ���� � ����
		SantaClaus s2 = SantaClaus.getInstance();
		SantaClaus s3 = SantaClaus.getInstance();
		System.out.println(s2);
		System.out.println(s3);

//		��������� �� ����� �� ��� MagicBoard �� �� ���� ��� �� ������� 
//		������ ������� ���� ������ � �� ����� ������ �� ����������
		MagicBoard magicBoard = new MagicBoard();

//		��������� �� ����� �� ��� Dwarf 
		Dwarf d1 = new Dwarf();
//		������� ���� �� ���� �� ������ d1 � ���������
		magicBoard.attach(d1);
//		�������� �� ����������(������) ��� ������������ ������� � ������ - ����������� �����
//		�� �� ����� ��������� �� ����������� �
		d1.attachBoard(magicBoard);


//		��������� �� ��������� ��� ������� � ����� �� ����� �� ������������
		santaNeedsDollCommand iNeedDoll = new santaNeedsDollCommand(magicBoard);
		santaNeedsBikeCommand iNeedBike = new santaNeedsBikeCommand(magicBoard);
		santaDontWantAnythingCommand iDontNeedAnything = new santaDontWantAnythingCommand(magicBoard);

//		���� ������ �� ������ ������� 
		s2.setCommand(iNeedDoll);
		
		s2.setCommand(iNeedBike);

//		��������� �� �������� �� ����������� �����
		s2.executeOnMagicBoard();

//		��������� �� ����� �� ��� Toy ���� �������� ����� ������� � ���� �� (Doll/Bike)
		Factory toy1 = d1.getToy("Doll");
//		������������� �� ���������� ����� 
		toy1.create();
		Factory toy2 = d1.getToy("Bike");
		toy2.create();

		s2.setCommand(iDontNeedAnything);
		s2.executeOnMagicBoard();
	}
}
