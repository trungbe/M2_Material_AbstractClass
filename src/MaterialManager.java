import java.util.Arrays;

public class MaterialManager {


    public Material[] materials = new Material[10];

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
