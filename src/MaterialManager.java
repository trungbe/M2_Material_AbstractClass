import java.util.Arrays;

public class MaterialManager {

    private static MaterialManager instance;
    public Material[] materials = new Material[10];

    public static MaterialManager getInstance() {
        if (instance == null) {
            synchronized (MaterialManager.class) {
                if (instance == null) {
                    instance = new MaterialManager();
                }
            }
        }
        return instance;
    }

    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

    public void showAllMaterial() {
        for (Material material : materials) {
            System.out.println(material);
        }
    }

    @Override
    public String toString() {
        return "MaterialManager{" +
                "materials=" + Arrays.toString(materials) +
                '}';
    }
}
