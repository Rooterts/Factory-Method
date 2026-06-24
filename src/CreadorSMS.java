/*
 * Autor: Adrián Pérez Pérez
 * Patrón: Factory Method - Sistema de Notificaciones
 */
public class CreadorSMS extends CreadorNotificacion {
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}