package SantaPackage;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {

	private List<Command> commandList = new ArrayList<Command>();

	// Инстанция на класа
	private static volatile SantaClaus santaClaus;

	// Конструктор с който се уверяваме че е невъзможно да се създаде друга
	// инстанция
	private SantaClaus() {

	}

	// Метод за извличане на инстанция (Имаме глобален достъп)
	public static SantaClaus getInstance() {
		if (santaClaus == null) {
			santaClaus = new SantaClaus();
		}
		return santaClaus;
	}

	public void setCommand(Command command) {
		commandList.add(command);
	}

	public void executeOnMagicBoard() {
		for (Command command : commandList) {
			command.execute();

		}
		commandList.clear();
	}

}
