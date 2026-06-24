/*
 * Autor: Adrián Pérez Pérez
 * Patrón: Factory Method - Sistema de Notificaciones
 */
public class NotificacionEmail implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: [" + mensaje + "]");
    }
}