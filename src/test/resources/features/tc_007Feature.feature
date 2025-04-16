Feature: Prueba de rendimiento de carga masiva de documentos

  Scenario: Carga de múltiples documentos y medición del tiempo de respuesta
    Given el sistema está listo para cargar documentos
    When inicio el proceso de carga de múltiples documentos simultáneamente
    Then el sistema mantiene un rendimiento aceptable sin mayores latencias
    And verifico que el tiempo de respuesta para cada carga está dentro de los SLA definidos