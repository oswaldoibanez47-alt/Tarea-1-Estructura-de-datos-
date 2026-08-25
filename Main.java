import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int seguidoresTwitterEnero = 0;
        int seguidoresTwitterJunio = 0;

        int vistasYoutubeEnero = 0;
        int vistasYoutubeFebrero = 0;
        int vistasYoutubeMarzo = 0;
        int vistasYoutubeAbril = 0;
        int vistasYoutubeMayo = 0;
        int vistasYoutubeJunio = 0;

        double crecimientoTwitterEnero = 0;
        double crecimientoTwitterFebrero = 0;
        double crecimientoTwitterMarzo = 0;
        double crecimientoTwitterAbril = 0;
        double crecimientoTwitterMayo = 0;
        double crecimientoTwitterJunio = 0;

        double crecimientoFacebookEnero = 0;
        double crecimientoFacebookFebrero = 0;
        double crecimientoFacebookMarzo = 0;
        double crecimientoFacebookAbril = 0;
        double crecimientoFacebookMayo = 0;
        double crecimientoFacebookJunio = 0;

        int meGustaTwitterEnero = 0;
        int meGustaTwitterFebrero = 0;
        int meGustaTwitterMarzo = 0;
        int meGustaTwitterAbril = 0;
        int meGustaTwitterMayo = 0;
        int meGustaTwitterJunio = 0;

        int meGustaFacebookEnero = 0;
        int meGustaFacebookFebrero = 0;
        int meGustaFacebookMarzo = 0;
        int meGustaFacebookAbril = 0;
        int meGustaFacebookMayo = 0;
        int meGustaFacebookJunio = 0;

        int meGustaYoutubeEnero = 0;
        int meGustaYoutubeFebrero = 0;
        int meGustaYoutubeMarzo = 0;
        int meGustaYoutubeAbril = 0;
        int meGustaYoutubeMayo = 0;
        int meGustaYoutubeJunio = 0;

        try {

            File archivo = new File("datos_redes_sociales1.csv");
            Scanner lector = new Scanner(archivo);

            // Saltamos los títulos del CSV
            lector.nextLine();

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                // El CSV está separado por comas
                String[] datos = linea.split(",");

                String redSocial = datos[0].trim();
                String concepto = datos[1].trim();

                // TWITTER - SEGUIDORES
                if (redSocial.equals("TWITTER")
                        && concepto.contains("SEGUIDORES")) {

                    seguidoresTwitterEnero =
                            Integer.parseInt(datos[3].trim());

                    seguidoresTwitterJunio =
                            Integer.parseInt(datos[8].trim());
                }

                // TWITTER - CRECIMIENTO O PORCENTAJE
                if (redSocial.equals("TWITTER")
                        && (concepto.contains("CRECIMIENTO")
                        || concepto.equals("PORCENTAJE"))) {

                    crecimientoTwitterEnero =
                            Double.parseDouble(datos[3].replace("%", "").trim());

                    crecimientoTwitterFebrero =
                            Double.parseDouble(datos[4].replace("%", "").trim());

                    crecimientoTwitterMarzo =
                            Double.parseDouble(datos[5].replace("%", "").trim());

                    crecimientoTwitterAbril =
                            Double.parseDouble(datos[6].replace("%", "").trim());

                    crecimientoTwitterMayo =
                            Double.parseDouble(datos[7].replace("%", "").trim());

                    crecimientoTwitterJunio =
                            Double.parseDouble(datos[8].replace("%", "").trim());
                }

                // TWITTER - ME GUSTA
                if (redSocial.equals("TWITTER")
                        && concepto.equals("ME GUSTA")) {

                    meGustaTwitterEnero =
                            Integer.parseInt(datos[3].trim());

                    meGustaTwitterFebrero =
                            Integer.parseInt(datos[4].trim());

                    meGustaTwitterMarzo =
                            Integer.parseInt(datos[5].trim());

                    meGustaTwitterAbril =
                            Integer.parseInt(datos[6].trim());

                    meGustaTwitterMayo =
                            Integer.parseInt(datos[7].trim());

                    meGustaTwitterJunio =
                            Integer.parseInt(datos[8].trim());
                }

                // FACEBOOK - CRECIMIENTO O PORCENTAJE
                if (redSocial.equals("FACEBOOK")
                        && (concepto.contains("CRECIMIENTO")
                        || concepto.equals("PORCENTAJE"))) {

                    crecimientoFacebookEnero =
                            Double.parseDouble(datos[3].replace("%", "").trim());

                    crecimientoFacebookFebrero =
                            Double.parseDouble(datos[4].replace("%", "").trim());

                    crecimientoFacebookMarzo =
                            Double.parseDouble(datos[5].replace("%", "").trim());

                    crecimientoFacebookAbril =
                            Double.parseDouble(datos[6].replace("%", "").trim());

                    crecimientoFacebookMayo =
                            Double.parseDouble(datos[7].replace("%", "").trim());

                    crecimientoFacebookJunio =
                            Double.parseDouble(datos[8].replace("%", "").trim());
                }

                // FACEBOOK - ME GUSTA EN PUBLICACIONES
                if (redSocial.equals("FACEBOOK")
                        && concepto.contains("ME GUSTA")) {

                    meGustaFacebookEnero =
                            Integer.parseInt(datos[3].trim());

                    meGustaFacebookFebrero =
                            Integer.parseInt(datos[4].trim());

                    meGustaFacebookMarzo =
                            Integer.parseInt(datos[5].trim());

                    meGustaFacebookAbril =
                            Integer.parseInt(datos[6].trim());

                    meGustaFacebookMayo =
                            Integer.parseInt(datos[7].trim());

                    meGustaFacebookJunio =
                            Integer.parseInt(datos[8].trim());
                }

                // YOUTUBE - VISUALIZACIONES
                if (redSocial.equals("YOUTUBE")
                        && concepto.equals("VISUALIZACIONES")) {

                    vistasYoutubeEnero =
                            Integer.parseInt(datos[3].trim());

                    vistasYoutubeFebrero =
                            Integer.parseInt(datos[4].trim());

                    vistasYoutubeMarzo =
                            Integer.parseInt(datos[5].trim());

                    vistasYoutubeAbril =
                            Integer.parseInt(datos[6].trim());

                    vistasYoutubeMayo =
                            Integer.parseInt(datos[7].trim());

                    vistasYoutubeJunio =
                            Integer.parseInt(datos[8].trim());
                }

                // YOUTUBE - ME GUSTA
                if (redSocial.equals("YOUTUBE")
                        && concepto.equals("ME GUSTA")) {

                    meGustaYoutubeEnero =
                            Integer.parseInt(datos[3].trim());

                    meGustaYoutubeFebrero =
                            Integer.parseInt(datos[4].trim());

                    meGustaYoutubeMarzo =
                            Integer.parseInt(datos[5].trim());

                    meGustaYoutubeAbril =
                            Integer.parseInt(datos[6].trim());

                    meGustaYoutubeMayo =
                            Integer.parseInt(datos[7].trim());

                    meGustaYoutubeJunio =
                            Integer.parseInt(datos[8].trim());
                }
            }

            lector.close();

            int diferenciaSeguidores =
                    seguidoresTwitterJunio - seguidoresTwitterEnero;

            System.out.println("========================================");
            System.out.println("1. DIFERENCIA DE SEGUIDORES DE TWITTER");
            System.out.println("========================================");
            System.out.println("Seguidores en enero: "
                    + seguidoresTwitterEnero);
            System.out.println("Seguidores en junio: "
                    + seguidoresTwitterJunio);
            System.out.println("Diferencia: "
                    + diferenciaSeguidores);

            Scanner teclado = new Scanner(System.in);

            System.out.println();
            System.out.println("========================================");
            System.out.println("2. DIFERENCIA DE VISUALIZACIONES DE YOUTUBE");
            System.out.println("========================================");
            System.out.println("1 - Enero");
            System.out.println("2 - Febrero");
            System.out.println("3 - Marzo");
            System.out.println("4 - Abril");
            System.out.println("5 - Mayo");
            System.out.println("6 - Junio");

            System.out.print("Escribe el primer mes: ");
            int primerMes = teclado.nextInt();

            System.out.print("Escribe el segundo mes: ");
            int segundoMes = teclado.nextInt();

            int vistasPrimerMes = 0;
            int vistasSegundoMes = 0;

            if (primerMes == 1) {
                vistasPrimerMes = vistasYoutubeEnero;
            }
            if (primerMes == 2) {
                vistasPrimerMes = vistasYoutubeFebrero;
            }
            if (primerMes == 3) {
                vistasPrimerMes = vistasYoutubeMarzo;
            }
            if (primerMes == 4) {
                vistasPrimerMes = vistasYoutubeAbril;
            }
            if (primerMes == 5) {
                vistasPrimerMes = vistasYoutubeMayo;
            }
            if (primerMes == 6) {
                vistasPrimerMes = vistasYoutubeJunio;
            }

            if (segundoMes == 1) {
                vistasSegundoMes = vistasYoutubeEnero;
            }
            if (segundoMes == 2) {
                vistasSegundoMes = vistasYoutubeFebrero;
            }
            if (segundoMes == 3) {
                vistasSegundoMes = vistasYoutubeMarzo;
            }
            if (segundoMes == 4) {
                vistasSegundoMes = vistasYoutubeAbril;
            }
            if (segundoMes == 5) {
                vistasSegundoMes = vistasYoutubeMayo;
            }
            if (segundoMes == 6) {
                vistasSegundoMes = vistasYoutubeJunio;
            }

            int diferenciaVistas =
                    vistasSegundoMes - vistasPrimerMes;

            if (diferenciaVistas < 0) {
                diferenciaVistas = diferenciaVistas * -1;
            }

            System.out.println("Visualizaciones del primer mes: "
                    + vistasPrimerMes);

            System.out.println("Visualizaciones del segundo mes: "
                    + vistasSegundoMes);

            System.out.println("Diferencia: "
                    + diferenciaVistas);

            double promedioTwitter =
                    (crecimientoTwitterEnero
                            + crecimientoTwitterFebrero
                            + crecimientoTwitterMarzo
                            + crecimientoTwitterAbril
                            + crecimientoTwitterMayo
                            + crecimientoTwitterJunio) / 6.0;

            double promedioFacebook =
                    (crecimientoFacebookEnero
                            + crecimientoFacebookFebrero
                            + crecimientoFacebookMarzo
                            + crecimientoFacebookAbril
                            + crecimientoFacebookMayo
                            + crecimientoFacebookJunio) / 6.0;

            System.out.println();
            System.out.println("========================================");
            System.out.println("3. PROMEDIO DE CRECIMIENTO");
            System.out.println("========================================");
            System.out.println("Twitter: " + promedioTwitter);
            System.out.println("Facebook: " + promedioFacebook);

            double promedioMeGustaTwitter =
                    (meGustaTwitterEnero
                            + meGustaTwitterFebrero
                            + meGustaTwitterMarzo
                            + meGustaTwitterAbril
                            + meGustaTwitterMayo
                            + meGustaTwitterJunio) / 6.0;

            double promedioMeGustaFacebook =
                    (meGustaFacebookEnero
                            + meGustaFacebookFebrero
                            + meGustaFacebookMarzo
                            + meGustaFacebookAbril
                            + meGustaFacebookMayo
                            + meGustaFacebookJunio) / 6.0;

            double promedioMeGustaYoutube =
                    (meGustaYoutubeEnero
                            + meGustaYoutubeFebrero
                            + meGustaYoutubeMarzo
                            + meGustaYoutubeAbril
                            + meGustaYoutubeMayo
                            + meGustaYoutubeJunio) / 6.0;

            System.out.println();
            System.out.println("========================================");
            System.out.println("4. PROMEDIO DE ME GUSTA");
            System.out.println("========================================");
            System.out.println("Twitter: " + promedioMeGustaTwitter);
            System.out.println("Facebook: " + promedioMeGustaFacebook);
            System.out.println("YouTube: " + promedioMeGustaYoutube);

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró datos_redes_sociales1.csv.");
        }
    }
}

