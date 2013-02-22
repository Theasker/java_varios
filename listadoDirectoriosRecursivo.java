package temp;

import java.io.File;
import java.io.IOException;

public class DirectoriosRecursivo {
  public static void listarDirectorio(File directorio){
    File[] listado;
    listado = directorio.listFiles();
    for (int cont=0;cont < listado.length;cont++){
      if (listado[cont].isDirectory()){
        System.out.println(listado[cont].getAbsolutePath());
        //System.out.println(listado[cont].getName());
        listarDirectorio(listado[cont]);
      }
      else{
        System.out.println(listado[cont].getAbsolutePath());
      }
    }
  }
  public static void main(String[] args) throws IOException {
    String path = "E:\\Documents and Settings\\u3440003.ALBIA.000\\Escritorio\\tmp\\";
    
    DirectoriosRecursivo temp = new DirectoriosRecursivo();
    Temp.listarDirectorio(new File(path));
  }
}
