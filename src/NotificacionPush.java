/*
 * Autor: Adrián Pérez Pérez
 * Patrón: Factory Method - Sistema de Notificaciones
 */
public class NotificacionPush implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Push: [" + mensaje + "]");
    }
}