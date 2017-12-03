import javax.swing.JFrame;

public class MapFrame extends  JFrame
{
	protected MapPanel _m;
	
	public MapFrame()
	{
		super();
		_m=new MapPanel();
		add(_m);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setVisible(true);

	}
	public static void main(String[] args)
	{
		MapFrame f=new MapFrame();
		
	}

}
