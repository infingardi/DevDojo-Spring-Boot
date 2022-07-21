package academy.devdojo.springboot2.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "The name of this anime cannot be empty")
    @NotNull(message = "The name of this anime cannot be null")
    private String name;
}
