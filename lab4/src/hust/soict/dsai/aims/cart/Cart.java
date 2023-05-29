package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
public class Cart {
	public ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public float totalCost() {
		return (float)itemsOrdered.stream().mapToDouble(Media::getCost).sum();
	}
    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
        }
    }
    public void removeMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
        }
    }
}

