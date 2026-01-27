/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Kevin Ajdini
 * Date Developed:1/25/2026
 * Last Date Changed:1/25/2026
 * Rev: 1/25/2026

 */
/**frame class
    kevin ajdini */
class Frame {
        private Material material;

        /** constructor constructs what is the frame and what it's made out of */
        public Frame(Material material) {
            this.material = material;
        }

        /** getter gets the material */
        public Material getMaterial() {  // Changed from getFrame()
            return material;
        }
    }

