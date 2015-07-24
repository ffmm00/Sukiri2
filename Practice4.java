import java.util.Date;

public class Practice4 implements Comparable<Practice4>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	public int hashCode() {
		int r = 1;
		r = 31 * r + publishDate.hashCode();
		r = 31 * r + title.hashCode();
		return r;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Practice4))
			return false;
		Practice4 pra4 = (Practice4) o;
		if (!publishDate.equals(pra4.publishDate))
			return false;
		if (!title.equals(pra4.title))
			return false;

		return true;
	}

	public int compareTo(Practice4 o) {
		return this.publishDate.compareTo(o.publishDate);
	}

	public Practice4 clone() {
		Practice4 pra4 = new Practice4();
		pra4.title = this.title;
		pra4.comment = this.comment;
		pra4.publishDate = (Date) this.publishDate.clone();
		return pra4;
	}

}
