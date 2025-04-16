Feature: Validación de la notificación post-carga

  Scenario: Completar una carga de documento exitosa y verificar notificación
    Given el usuario ha iniciado sesión correctamente
    When el usuario completa una carga de documento exitosa
    Then el sistema envía una notificación de confirmación al usuario

  Scenario: Verificar el historial de notificaciones
    Given el usuario ha iniciado sesión correctamente
    And el usuario ha completado una carga de documento
    When el usuario accede al historial de notificaciones
    Then el historial muestra el registro del documento recientemente cargado