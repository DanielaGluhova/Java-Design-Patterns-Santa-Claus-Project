package SantaPackage;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard {

	private List<Dwarf> dwarfs = new ArrayList<>();

	public void attach(Dwarf dwarf) {
		dwarfs.add(dwarf);
	}

	public void deattach(Dwarf dwarf) {
		dwarfs.remove(dwarf);
	}

	public void notifyDwarfs() {
		for (Dwarf dwarf : dwarfs) {
			dwarf.update();
		}
	}

	public void needOfDoll() {
		System.out.println("������ �� �����!");
		notifyDwarfs();
	}

	public void needOfBike() {
		System.out.println("������ �� ������!");
		notifyDwarfs();
	}

	public void dontNeedAnything() {
		System.out.println("�������� �������� ���!");
		notifyDwarfs();
	}
}
