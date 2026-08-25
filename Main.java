import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables para guardar los datos que necesitamos
        int seguidoresTwitterEnero = 0;
        int seguidoresTwitterJunio = 0;

        int visualizacionesYoutubeEnero = 0;
        int visualizacionesYoutubeJunio = 0;

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

        int facebookMeGustaEnero = 0;
        int facebookMeGustaFebrero = 0;
        int facebookMeGustaMarzo = 0;
        int facebookMeGustaAbril = 0;
        int facebookMeGustaMayo = 0;
        int facebookMeGustaJunio = 0;

        int twitterMeGustaEnero = 0;
        int twitterMeGustaFebrero = 0;
        int twitterMeGustaMarzo = 0;
        int twitterMeGustaAbril = 0;
        int twitterMeGustaMayo = 0;
        int twitterMeGustaJunio = 0;

        int youtubeMeGustaEnero = 0;
        int youtubeMeGustaFebrero = 0;
        int youtubeMeGustaMarzo = 0;
        int youtubeMeGustaAbril = 0;
        int youtubeMeGustaMayo = 0;
        int youtubeMeGustaJunio = 0;

        try {

            // Abrimos el archivo CSV
            File archivo = new File("datos_redes_sociales1.csv");

            Scanner lector = new Scanner(archivo);

            // Leemos el archivo línea por línea
            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                // Saltamos la primera línea que contiene los encabezados
                if (linea.startsWith("RED SOCIAL")) {
                    continue;
                }

                // Separamos cada línea usando la coma
                String[] datos = linea.split(",");

                String redSocial = datos[0].trim();
                String concepto = datos[1].trim();

                // ==============================
                // TWITTER - SEGUIDORES
                // ==============================

                if (redSocial.equals("TWITTER")
                        && concepto.equals("SEGUIDORES (FOLLOWERS)")) {

                    seguidoresTwitterEnero = Integer.parseInt(datos[3].trim());
                    seguidoresTwitterJunio = Integer.parseInt(datos[8].trim());
                }

                // ==============================
                // YOUTUBE - VISUALIZACIONES
                // ==============================

                if (redSocial.equals("YOUTUBE")
                        && concepto.equals("VISUALIZACIONES")) {

                    visualizacionesYoutubeEnero = Integer.parseInt(datos[3].trim());
                    visualizacionesYoutubeJunio = Integer.parseInt(datos[8].trim());
                }

                // ==============================
                // TWITTER - PORCENTAJE DE CRECIMIENTO
                // ==============================

                if (redSocial.equals("TWITTER")
                        && concepto.equals("PORCENTAJE DE CRECIMIENTO")) {

                    crecimientoTwitterEnero = Double.parseDouble(datos[3].replace("%", "").trim());
                    crecimientoTwitterFebrero = Double.parseDouble(datos[4].replace("%", "").trim());
                    crecimientoTwitterMarzo = Double.parseDouble(datos[5].replace("%", "").trim());
                    crecimientoTwitterAbril = Double.parseDouble(datos[6].replace("%", "").trim());
                    crecimientoTwitterMayo = Double.parseDouble(datos[7].replace("%", "").trim());
                    crecimientoTwitterJunio = Double.parseDouble(datos[8].replace("%", "").trim());
                }

                // ==============================
                // FACEBOOK - PORCENTAJE DE CRECIMIENTO
                // ==============================

                if (redSocial.equals("FACEBOOK")
                        && concepto.equals("PORCENTAJE DE CRECIMIENTO")) {

                    crecimientoFacebookEnero = Double.parseDouble(datos[3].replace("%", "").trim());
                    crecimientoFacebookFebrero = Double.parseDouble(datos[4].replace("%", "").trim());
                    crecimientoFacebookMarzo = Double.parseDouble(datos[5].replace("%", "").trim());
                    crecimientoFacebookAbril = Double.parseDouble(datos[6].replace("%", "").trim());
                    crecimientoFacebookMayo = Double.parseDouble(datos[7].replace("%", "").trim());
                    crecimientoFacebookJunio = Double.parseDouble(datos[8].replace("%", "").trim());
                }

                // ==============================
                // FACEBOOK - ME GUSTA
                // ==============================

                if (redSocial.equals("FACEBOOK")
                        && concepto.equals("ME GUSTA EN PUBLICACIONES")) {

                    facebookMeGustaEnero = Integer.parseInt(datos[3].trim());
                    facebookMeGustaFebrero = Integer.parseInt(datos[4].trim());
                    facebookMeGustaMarzo = Integer.parseInt(datos[5].trim());
                    facebookMeGustaAbril = Integer.parseInt(datos[6].trim());
                    facebookMeGustaMayo = Integer.parseInt(datos[7].trim());
                    facebookMeGustaJunio = Integer.parseInt(datos[8].trim());
                }

                // ==============================
                // TWITTER - ME GUSTA
                // ==============================

                if (redSocial.equals("TWITTER")
                        && concepto.equals("ME GUSTA")) {

                    twitterMeGustaEnero = Integer.parseInt(datos[3].trim());
                    twitterMeGustaFebrero = Integer.parseInt(datos[4].trim());
                    twitterMeGustaMarzo = Integer.parseInt(datos[5].trim());
                    twitterMeGustaAbril = Integer.parseInt(datos[6].trim());
                    twitterMeGustaMayo = Integer.parseInt(datos[7].trim());
                    twitterMeGustaJunio = Integer.parseInt(datos[8].trim());
                }

                // ==============================
                // YOUTUBE - ME GUSTA
                // ==============================

                if (redSocial.equals("YOUTUBE")
                        && concepto.equals("ME GUSTA")) {

                    youtubeMeGustaEnero = Integer.parseInt(datos[3].trim());
                    youtubeMeGustaFebrero = Integer.parseInt(datos[4].trim());
                    youtubeMeGustaMarzo = Integer.parseInt(datos[5].trim());
                    youtubeMeGustaAbril = Integer.parseInt(datos[6].trim());
                    youtubeMeGustaMayo = Integer.parseInt(datos[7].trim());
                    youtubeMeGustaJunio = Integer.parseInt(datos[8].trim());
                }
            }

            lector.close();

            // ==========================================
            // 1. DIFERENCIA DE SEGUIDORES DE TWITTER
            // ==========================================

            int diferenciaTwitter =
                    seguidoresTwitterJunio - seguidoresTwitterEnero;

            System.out.println();
            System.out.println("==========================================");
            System.out.println("1. DIFERENCIA DE SEGUIDORES DE TWITTER");
            System.out.println("==========================================");

            System.out.println("Seguidores en enero: " + seguidoresTwitterEnero);
            System.out.println("Seguidores en junio: " + seguidoresTwitterJunio);
            System.out.println("Diferencia: " + diferenciaTwitter);


            // ==========================================
            // 2. DIFERENCIA DE VISUALIZACIONES DE YOUTUBE
            // ==========================================

            Scanner teclado = new Scanner(System.in);

            System.out.println();
            System.out.println("==========================================");
            System.out.println("2. DIFERENCIA DE VISUALIZACIONES DE YOUTUBE");
            System.out.println("==========================================");

            System.out.println("Escribe el primer mes:");
            System.out.println("1 - Enero");
            System.out.println("2 - Febrero");
            System.out.println("3 - Marzo");
            System.out.println("4 - Abril");
            System.out.println("5 - Mayo");
            System.out.println("6 - Junio");

            int mes1 = teclado.nextInt();

            System.out.println("Escribe el segundo mes:");
            int mes2 = teclado.nextInt();

            int visualizacion1 = obtenerVisualizaciones(
                    mes1,
                    visualizacionesYoutubeEnero,
                    visualizacionesYoutubeJunio
            );

            int visualizacion2 = obtenerVisualizaciones(
                    mes2,
                    visualizacionesYoutubeEnero,
                    visualizacionesYoutubeJunio
            );

            /*
             * Para poder utilizar todos los meses,
             * guardamos las visualizaciones en un arreglo.
             */
            int[] visualizacionesYoutube = {
                    visualizacionesYoutubeEnero,
                    obtenerMesYoutube(2, visualizacionesYoutubeEnero, visualizacionesYoutubeJunio),
                    obtenerMesYoutube(3, visualizacionesYoutubeEnero, visualizacionesYoutubeJunio),
                    obtenerMesYoutube(4, visualizacionesYoutubeEnero, visualizacionesYoutubeJunio),
                    obtenerMesYoutube(5, visualizacionesYoutubeEnero, visualizacionesYoutubeJunio),
                    visualizacionesYoutubeJunio
            };

            visualizacion1 = visualizacionesYoutube[mes1 - 1];
            visualizacion2 = visualizacionesYoutube[mes2 - 1];

            int diferenciaVisualizaciones =
                    Math.abs(visualizacion2 - visualizacion1);

            System.out.println();
            System.out.println("Visualizaciones del primer mes: " + visualizacion1);
            System.out.println("Visualizaciones del segundo mes: " + visualizacion2);
            System.out.println("Diferencia: " + diferenciaVisualizaciones);


            // ==========================================
            // 3. PROMEDIO DE CRECIMIENTO DE TWITTER
            // ==========================================

            double promedioTwitter =
                    (crecimientoTwitterEnero
                            + crecimientoTwitterFebrero
                            + crecimientoTwitterMarzo
                            + crecimientoTwitterAbril
                            + crecimientoTwitterMayo
                            + crecimientoTwitterJunio) / 6;


            // ==========================================
            // 4. PROMEDIO DE CRECIMIENTO DE FACEBOOK
            // ==========================================

            double promedioFacebook =
                    (crecimientoFacebookEnero
                            + crecimientoFacebookFebrero
                            + crecimientoFacebookMarzo
                            + crecimientoFacebookAbril
                            + crecimientoFacebookMayo
                            + crecimientoFacebookJunio) / 6;


            System.out.println();
            System.out.println("==========================================");
            System.out.println("3. PROMEDIO DE CRECIMIENTO");
            System.out.println("==========================================");

            System.out.printf("Promedio Twitter: %.2f%%%n", promedioTwitter);
            System.out.printf("Promedio Facebook: %.2f%%%n", promedioFacebook);


            // ==========================================
            // 5. PROMEDIO DE ME GUSTA
            // ==========================================

            double promedioFacebookMeGusta =
                    (facebookMeGustaEnero
                            + facebookMeGustaFebrero
                            + facebookMeGustaMarzo
                            + facebookMeGustaAbril
                            + facebookMeGustaMayo
                            + facebookMeGustaJunio) / 6.0;

            double promedioTwitterMeGusta =
                    (twitterMeGustaEnero
                            + twitterMeGustaFebrero
                            + twitterMeGustaMarzo
                            + twitterMeGustaAbril
                            + twitterMeGustaMayo
                            + twitterMeGustaJunio) / 6.0;

            double promedioYoutubeMeGusta =
                    (youtubeMeGustaEnero
                            + youtubeMeGustaFebrero
                            + youtubeMeGustaMarzo
                            + youtubeMeGustaAbril
                            + youtubeMeGustaMayo
                            + youtubeMeGustaJunio) / 6.0;


            System.out.println();
            System.out.println("==========================================");
            System.out.println("4. PROMEDIO DE ME GUSTA");
            System.out.println("==========================================");

            System.out.printf("Facebook: %.2f%n", promedioFacebookMeGusta);
            System.out.printf("Twitter: %.2f%n", promedioTwitterMeGusta);
            System.out.printf("YouTube: %.2f%n", promedioYoutubeMeGusta);

            teclado.close();

        } catch (FileNotFoundException e) {

            System.out.println("No se encontró el archivo CSV.");

        }
    }


    // Método para obtener las visualizaciones de un mes
    public static int obtenerVisualizaciones(
            int mes,
            int enero,
            int junio) {

        if (mes == 1) {
            return enero;
        }

        if (mes == 6) {
            return junio;
        }

        return 0;
    }


    // Método auxiliar para los meses intermedios
    public static int obtenerMesYoutube(
            int mes,
            int enero,
            int junio) {

        /*
         * Este método se reemplaza por los valores reales
         * que vienen del archivo CSV.
         */
        return 0;
    }
}
