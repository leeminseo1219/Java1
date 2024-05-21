
public class Box {

	int width,length,height;
	
	public Box(int w, int l, int h) {
		
		width=w;
		length=l;
		height=h;
		
	}
	
	public boolean isSameBox(Box obj) {
		if((obj.width==width)&(obj.length==length)&(obj.height==height))
			return true;
		else
			return false;
		
	}
}

