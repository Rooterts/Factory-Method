/*
 * Autor: Adrián Pérez Pérez
 * Patrón: Factory Method - Sistema de Notificaciones
 */
public class CreadorPush extends CreadorNotificacion {
    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionPush();
    }
}