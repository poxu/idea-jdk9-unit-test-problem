import com.demo.hidden.SoftwareProductImpl;
import com.demo.visible.SoftwareProduct;
module com.demo.library {
    exports com.demo.visible;
    provides SoftwareProduct with SoftwareProductImpl;
}