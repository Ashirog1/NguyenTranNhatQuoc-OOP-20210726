Question: If the passing object is not an instance of Media, what happens ?

Answer: If the object is based on a subtype of Media, such as Book, for example, the code will compile normally. Otherwise, it will yield an error

Question: Alternatively, to compare items in the cart, instead of using Comparator, we can use the Comparable interface and override the compareTo()method. You can refer to the Java docs to see the information of this interface.  

Suppose we are taking this Comparable interface approach. 

What class should implement the Comparable interface? 
Media

In those classes, how should you implement the compareTo()method be to reflect the ordering that we want? 
The compareTo() method should compare the fields that define the ordering we want.

Can we have two ordering rules of the item (by title then cost and by cost then title) if we use this Comparable interface approach? 
Yes

Suppose the DVDs has a different ordering rule from the other media types, that is by title, then decreasing length, then cost. How would you modify your code to allow this? 

```java
@Override
public int compareTo(Media o) {
    int compareTitle = this.getTitle().compareTo(o.getTitle());
    if (compareTitle != 0) {
        return compareTitle;    
    }  
    
    // Compare lengths in descending order
    int compareLength = o.length - this.length;
    if (compareLength != 0) {
        return compareLength;
    }
    
    return Double.compare(this.getCost(), o.getCost());     
}      
```