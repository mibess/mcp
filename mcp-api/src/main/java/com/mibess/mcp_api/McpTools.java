package com.mibess.mcp_api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;

@Component
public class McpTools {
    private static final Logger LOG = LoggerFactory.getLogger(McpTools.class.getName());

    @McpTool(
            name = "mibess-working-projects",
            description = "Returns a list of working projects."
    )
    public String getWorkingProjects(){
        return """
                - Liga PES
                - EAD
                - MCP API
                - MCP Frontend
                - Angular Profile
                - Portfolio
                - Kronosmind
                """;
    }
}
