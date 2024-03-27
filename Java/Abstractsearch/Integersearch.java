package demopack;

public class Integersearch extends Abstractsearch {

	@Override
	public boolean search(Object[] objlist, Object obj) {
		for(int i=0;i<objlist.length;i++) {
			if(objlist[i]==obj) {
				return true;
			}
		}
		return false;
	}

}
