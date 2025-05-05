<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:gpx="http://www.topografix.com/GPX/1/1">
    <xsl:output method="text" encoding="UTF-8" />

    <xsl:template match="/">
        <xsl:value-of select="gpx:gpx/gpx:metadata/gpx:name"/>
        <xsl:text>;</xsl:text>
        <xsl:value-of select="gpx:gpx/gpx:metadata/gpx:author/gpx:name"/>
        <xsl:text>;</xsl:text>
        <xsl:value-of select="gpx:gpx/gpx:metadata/gpx:link/@href"/>
        <xsl:text>&#10;</xsl:text>

        <xsl:text>Tipo;Latitud;Longitud;Elevación;Tiempo;Nombre</xsl:text>
        <xsl:text>&#10;</xsl:text>

        <xsl:for-each select="//gpx:wpt">
            <xsl:text>waypoint;</xsl:text>
            <xsl:value-of select="@lat"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="@lon"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:ele"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:time"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:name"/>
            <xsl:text>&#10;</xsl:text>
        </xsl:for-each>

        <xsl:for-each select="//gpx:trkpt">
            <xsl:text>trackpoint;</xsl:text>
            <xsl:value-of select="@lat"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="@lon"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:ele"/>
            <xsl:text>;</xsl:text>
            <xsl:value-of select="gpx:time"/>
            <xsl:text>&#10;</xsl:text>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>
