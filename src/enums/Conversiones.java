package enums;

import java.util.ArrayList;
import java.util.HashSet;

public enum Conversiones {
    DOLAR_USD_DOLAR_CAD("Moneda", "Dolar estadounidense", "Dolar canadiense", 1.2688, 0.0),
    DOLAR_USD_DOLAR_AUD("Moneda", "Dolar estadounidense", "Dolar australiano", 1.2993, 0.0),
    DOLAR_USD_EURO("Moneda", "Dolar estadounidense", "Euro", 0.8538, 0.0),
    DOLAR_USD_PESO_ARG("Moneda", "Dolar estadounidense", "Peso argentino", 207.8, 0.0),
    DOLAR_USD_BOLIVARES("Moneda", "Dolar estadounidense", "Bolívares", 3611063.20, 0.0),
    DOLAR_USD_YEN("Moneda", "Dolar estadounidense", "Yen", 109.360, 0.0),
    DOLAR_USD_LIBRA_ESTERLINA("Moneda", "Dolar estadounidense", "Libra esterlina", 0.7244, 0.0),
    DOLAR_USD_PESO_MXN("Moneda", "Dolar estadounidense", "Peso mexicano", 20.4891, 0.0),
    DOLAR_CAD_DOLAR_AUD("Moneda", "Dolar canadiense", "Dolar australiano", 1.0222, 0.0),
    DOLAR_CAD_EURO("Moneda", "Dolar canadiense", "Euro", 0.6708, 0.0),
    DOLAR_CAD_PESO_ARG("Moneda", "Dolar canadiense", "Peso argentino", 152.64, 0.0),
    DOLAR_CAD_BOLIVARES("Moneda", "Dolar canadiense", "Bolívares", 2852855.25, 0.0),
    DOLAR_CAD_YEN("Moneda", "Dolar canadiense", "Yen", 86.3666, 0.0),
    DOLAR_CAD_LIBRA_ESTERLINA("Moneda", "Dolar canadiense", "Libra esterlina", 0.5712, 0.0),
    DOLAR_CAD_PESO_MXN("Moneda", "Dolar canadiense", "Peso mexicano", 16.0383, 0.0),
    DOLAR_AUD_EURO("Moneda", "Dolar australiano", "Euro", 0.6549, 0.0),
    DOLAR_AUD_PESO_ARG("Moneda", "Dolar australiano", "Peso argentino", 139.32, 0.0),
    DOLAR_AUD_BOLIVARES("Moneda", "Dolar australiano", "Bolívares", 2790984.75, 0.0),
    DOLAR_AUD_YEN("Moneda", "Dolar australiano", "Yen", 84.5365, 0.0),
    DOLAR_AUD_LIBRA_ESTERLINA("Moneda", "Dolar australiano", "Libra esterlina", 0.54, 0.0),

    C_F("Temperatura", "Celsius", "Fahrenheit", 1.8, 32.0),
    C_K("Temperatura", "Celsius", "Kelvin", 1.0, 273.15),
    F_C("Temperatura", "Fahrenheit", "Celsius", 5.0 / 9.0, -32.0 * 5.0 / 9.0),
    F_K("Temperatura", "Fahrenheit", "Kelvin", 5.0 / 9.0, -32.0 * 5.0 / 9.0 + 273.15),
    K_C("Temperatura", "Kelvin", "Celsius", 1.0, -273.15),
    K_F("Temperatura", "Kelvin", "Fahrenheit", 1.8, -273.15 * 1.8 + 32.0),

    CM_M("Distancia", "Centímetro", "Metro", 0.01, 0.0),
    CM_KM("Distancia", "Centímetro", "Kilómetro", 0.00001, 0.0),
    CM_MILLA("Distancia", "Centímetro", "Milla", 0.00000621371, 0.0),
    CM_FT("Distancia", "Centímetro", "Pie", 0.0328084, 0.0),
    CM_INCH("Distancia", "Centímetro", "Pulgada", 0.393701, 0.0),
    M_CM("Distancia", "Metro", "Centímetro", 100.0, 0.0),
    M_KM("Distancia", "Metro", "Kilómetro", 0.001, 0.0),
    M_MILLA("Distancia", "Metro", "Milla", 0.000621371, 0.0),
    M_FT("Distancia", "Metro", "Pie", 3.28084, 0.0),
    M_INCH("Distancia", "Metro", "Pulgada", 39.3701, 0.0),
    KM_CM("Distancia", "Kilómetro", "Centímetro", 100000.0, 0.0),
    KM_M("Distancia", "Kilómetro", "Metro", 1000.0, 0.0),
    KM_MILLA("Distancia", "Kilómetro", "Milla", 0.621371, 0.0),
    KM_FT("Distancia", "Kilómetro", "Pie", 3280.84, 0.0),
    KM_INCH("Distancia", "Kilómetro", "Pulgada", 39370.1, 0.0),
    MILLA_CM("Distancia", "Milla", "Centímetro", 160934.0, 0.0),
    MILLA_M("Distancia", "Milla", "Metro", 1609.34, 0.0),
    MILLA_KM("Distancia", "Milla", "Kilómetro", 1.60934, 0.0),
    MILLA_FT("Distancia", "Milla", "Pie", 5280.0, 0.0),
    MILLA_INCH("Distancia", "Milla", "Pulgada", 63360.0, 0.0),
    FT_CM("Distancia", "Pie", "Centímetro", 30.48, 0.0),
    FT_M("Distancia", "Pie", "Metro", 0.3048, 0.0),
    FT_KM("Distancia", "Pie", "Kilómetro", 0.0003048, 0.0),
    FT_MILLA("Distancia", "Pie", "Milla", 0.000189394, 0.0),
    FT_INCH("Distancia", "Pie", "Pulgada", 12.0, 0.0),
    INCH_CM("Distancia", "Pulgada", "Centímetro", 2.54, 0.0),
    INCH_M("Distancia", "Pulgada", "Metro", 0.0254, 0.0),
    INCH_KM("Distancia", "Pulgada", "Kilómetro", 0.0000254, 0.0),

    L_GAL("Volumen", "Litro", "Galón", 0.264172, 0.0),
    L_CM3("Volumen", "Litro", "Centímetro cúbico", 1000.0, 0.0),
    M3_CM3("Volumen", "Metro cúbico", "Centímetro cúbico", 1000000.0, 0.0),
    M3_L("Volumen", "Metro cúbico", "Litro", 1000.0, 0.0),
    GAL_CM3("Volumen", "Galón", "Centímetro cúbico", 3785.41, 0.0),
    GAL_M3("Volumen", "Galón", "Metro cúbico", 0.00378541, 0.0),
    CM3_M3("Volumen", "Centímetro cúbico", "Metro cúbico", 0.000001, 0.0),
    L_M3("Volumen", "Litro", "Metro cúbico", 0.001, 0.0),

    HECTARE_ACRE("Área", "Hectárea", "Acre", 2.47105, 0.0),
    HECTARE_M2("Área", "Hectárea", "Metro cuadrado", 10000.0, 0.0),
    ACRE_M2("Área", "Acre", "Metro cuadrado", 4046.86, 0.0),
    ACRE_HECTARE("Área", "Acre", "Hectárea", 0.404686, 0.0),
    M2_ACRE("Área", "Metro cuadrado", "Acre", 0.000247105, 0.0),
    M2_HECTARE("Área", "Metro cuadrado", "Hectárea", 0.0001, 0.0),

    MPS_KMPS("Velocidad", "Metros por segundo", "Kilómetros por segundo", 0.001, 0.0),
    MPS_KMH("Velocidad", "Metros por segundo", "Kilómetros por hora", 3.6, 0.0),
    MPS_MPH("Velocidad", "Metros por segundo", "Millas por hora", 2.23694, 0.0),
    MPS_KTS("Velocidad", "Metros por segundo", "Nudos", 1.94384, 0.0),
    KMPS_MPS("Velocidad", "Kilómetros por segundo", "Metros por segundo", 1000.0, 0.0),
    KMPS_KMH("Velocidad", "Kilómetros por segundo", "Kilómetros por hora", 3600.0, 0.0),
    KMPS_MPH("Velocidad", "Kilómetros por segundo", "Millas por hora", 2236.94, 0.0),
    KMPS_KTS("Velocidad", "Kilómetros por segundo", "Nudos", 1943.84, 0.0),
    KMH_MPS("Velocidad", "Kilómetros por hora", "Metros por segundo", 0.277778, 0.0),
    KMH_KMPS("Velocidad", "Kilómetros por hora", "Kilómetros por segundo", 0.000277778, 0.0),
    KMH_MPH("Velocidad", "Kilómetros por hora", "Millas por hora", 0.621371, 0.0),
    KMH_KTS("Velocidad", "Kilómetros por hora", "Nudos", 0.539957, 0.0),
    MPH_MPS("Velocidad", "Millas por hora", "Metros por segundo", 0.44704, 0.0),
    MPH_KMPS("Velocidad", "Millas por hora", "Kilómetros por segundo", 0.00044704, 0.0),
    MPH_KMH("Velocidad", "Millas por hora", "Kilómetros por hora", 1.60934, 0.0),
    MPH_KTS("Velocidad", "Millas por hora", "Nudos", 0.868976, 0.0),
    KTS_MPS("Velocidad", "Nudos", "Metros por segundo", 0.514444, 0.0),
    KTS_KMPS("Velocidad", "Nudos", "Kilómetros por segundo", 0.000514444, 0.0),
    KTS_KMH("Velocidad", "Nudos", "Kilómetros por hora", 1.852, 0.0),
    KTS_MPH("Velocidad", "Nudos", "Millas por hora", 1.15078, 0.0);

    private String tipo;
    private String nombre_a;
    private String nombre_b;
    private Double a;
    private Double b;

    Conversiones(String tipo, String nombre_a, String nombre_b, Double a, Double b) {
        this.tipo = tipo;
        this.nombre_a = nombre_a;
        this.nombre_b = nombre_b;
        this.a = a;
        this.b = b;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getNombreA() {
        return this.nombre_a;
    }

    public String getNombreB() {
        return this.nombre_b;
    }

    public Double getA() {
        return this.a;
    }

    public Double getB() {
        return this.b;
    }

    public static HashSet<String> listarTipos() {
        HashSet<String> tipos = new HashSet<>();
        for (Conversiones conversion : Conversiones.values()) {
            tipos.add(conversion.getTipo());
        }
        return tipos;
    }

    public static ArrayList<Conversiones> listarPorTipo(String tipo) {
        ArrayList<Conversiones> listado = new ArrayList<>();
        for (Conversiones conversion : Conversiones.values()) {
            if (conversion.getTipo().equals(tipo))
                listado.add(conversion);
        }
        return listado;
    }

    public static HashSet<String> obtenerUnicosNombreA(ArrayList<Conversiones> lista) {
        HashSet<String> listado = new HashSet<>();
        for (Conversiones conversion : lista) {
            listado.add(conversion.getNombreA());
        }
        return listado;
    }

    public static HashSet<String> obtenerUnicosNombreBSegunNombreA(ArrayList<Conversiones> lista, String nombre) {
        HashSet<String> listado = new HashSet<>();
        for (Conversiones conversion : lista) {
            if (conversion.getNombreA().equals(nombre))
                listado.add(conversion.getNombreB());
        }
        return listado;
    }

    public static Double obtenerA(ArrayList<Conversiones> lista, String nombreA, String nombreB) {
        for (Conversiones conversion : lista) {
            if (conversion.getNombreA().equals(nombreA) & conversion.getNombreB().equalsIgnoreCase(nombreB))
                return conversion.getA();
        }
        return null;
    }

    public static Double obtenerB(ArrayList<Conversiones> lista, String nombreA, String nombreB) {
        for (Conversiones conversion : lista) {
            if (conversion.getNombreA().equals(nombreA) & conversion.getNombreB().equalsIgnoreCase(nombreB))
                return conversion.getB();
        }
        return 0.0;
    }
}
