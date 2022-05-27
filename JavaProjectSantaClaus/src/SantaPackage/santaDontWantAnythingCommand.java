package SantaPackage;



public class santaDontWantAnythingCommand implements Command {

	private MagicBoard magicBoard;

	public santaDontWantAnythingCommand(MagicBoard magicBoard) {
		this.magicBoard = magicBoard;
	}

	@Override
	public void execute() {
		magicBoard.dontNeedAnything();

	}

}
