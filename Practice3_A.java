enum KeyType {
	PADLOCK, BUTTON, DIAL, FINGER;
}

public class Practice3_A<E> {
	private KeyType keyType;
	private E item;
	private long count;

	public Practice3_A(KeyType key) {
		this.keyType = key;
	}

	public void put(E i) {
		this.item = i;
	}

	public E get() {
		this.count++;
		switch (this.keyType) {
		case PADLOCK:
			if (count < 1024)
				return null;
		case BUTTON:
			if (count < 10000)
				return null;
		case DIAL:
			if (count < 30000)
				return null;
		case FINGER:
			if (count < 1000000L)
				return null;
		}

		this.count = 0;

		return this.item;
	}

}
