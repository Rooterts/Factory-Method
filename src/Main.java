/*
 * Autor: Adrián Pérez Pérez
 * Patrón: Factory Method - Sistema de Notificaciones
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Notificaciones - Factory Method ===\n");

        // Creamos los tres creadores concretos
        CreadorNotificacion creadorEmail = new CreadorEmail();
        CreadorNotificacion creadorSMS = new CreadorSMS();
        CreadorNotificacion creadorPush = new CreadorPush();

        // El cliente recibe el creador y envía sin conocer la clase concreta
        Cliente cliente = new Cliente(creadorEmail);
        cliente.enviarNotificacion("Bienvenido a nuestra plataforma");

        cliente = new Cliente(creadorSMS);
        cliente.enviarNotificacion("Tu código de verificación es 1234");

        cliente = new Cliente(creadorPush);
        cliente.enviarNotificacion("Tienes una nueva solicitud de amistad");
    }
}