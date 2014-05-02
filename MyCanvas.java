import java.awt.*;

public class MyCanvas extends Canvas{
	public int x[] = new int[200], y[] = new int[200], num = 0;

	@Override public void paint( Graphics g ) {
		for( int i=0; i<num; i++ ) {
			g.setColor( new Color( 0, 0, 0 ) );
			g.fillOval( x[i], y[i], 5, 5 );
		}
	}

	public void setPoint( int x, int y ){
		this.x[ num ] = x;
		this.y[ num ] = y;
		num++;
		if( num >= 200 )	num = 0;
		repaint();
	}
}
