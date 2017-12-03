import java.awt.Graphics;

import javax.swing.JPanel;

import Map.Map;

public class MapPanel extends JPanel
{
	protected int _numberOfRows;
	protected int _numberOfCols;
	protected int _sizeBlock;
	protected Img _imgBackgroung;
	protected Img _images;
	protected Map _map;

	public MapPanel()
	{
		_numberOfRows=15;
		_numberOfCols=15;
		_sizeBlock=5;
		_imgBackgroung=new Img("images\\background.jpg", 0,0,3000,4000);
		_images=new Img("images\\plane22.jpg",0,0,0,0);
		_map=new Map(500,500,"Maps\\file1.xml");
		

	}

	@Override
	protected void paintComponent(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paintComponent(g);
		_imgBackgroung.drawImg(g);
		for (int i=0; i<_sizeBlock ; i++)
		{
			for(int j=0; j<16; j++)
			{
				//if ((_map.get_map()[i][j] & 1) != 0) // BrownBlock
				{
					_images.setImgCords((j * _sizeBlock), (i) * _sizeBlock);
					_images.drawImg(g);
				}

			}
		}
	}
}

