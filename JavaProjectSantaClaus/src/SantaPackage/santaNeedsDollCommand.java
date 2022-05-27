package SantaPackage;

public class santaNeedsDollCommand implements Command {

	private MagicBoard magicBoard;

	public santaNeedsDollCommand(MagicBoard magicBoard) {
		this.magicBoard = magicBoard;
	}

	@Override
	public void execute() {
		magicBoard.needOfDoll();
	}
}
