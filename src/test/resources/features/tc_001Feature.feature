Feature: Carga de documento con formato PDF válido

  Scenario: Cargar y verificar un documento PDF válido
    Given que estoy en la página de carga de documentos
    When selecciono un archivo PDF válido desde el explorador de archivos
    Then el sistema reconoce el archivo y muestra sus detalles
    When hago clic en el botón 'Cargar documento'
    Then el documento se carga correctamente y se muestra una notificación de éxito
    Then verifico que el documento aparezca en la lista de documentos
    And el documento se muestra en la lista con su nombre y fecha de carga