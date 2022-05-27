package SantaPackage;

public class santaNeedsBikeCommand implements Command {

	private MagicBoard magicBoard;

	public santaNeedsBikeCommand(MagicBoard magicBoard) {
		this.magicBoard = magicBoard;
	}

	@Override
	public void execute() {
		magicBoard.needOfBike();
	}

}
