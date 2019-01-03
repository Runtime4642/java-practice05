package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		if ( function.equals("음악") ) {
			playMusic();
			return;
		}
		else if ( function.equals("통화") ) {
			call();
			return;
		}
		else if ( function.equals("앱") ) {
		    app();
			return;
		}
	}

	@Override
	protected void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("다운로드해서 음악재생");
	}
	public void call()
	{
		System.out.println("통화기능시작");
	}
	public void app()
	{
		System.out.println("앱실행");
	}
}
