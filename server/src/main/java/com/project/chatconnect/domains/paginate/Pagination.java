package com.project.chatconnect.domains.paginate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The type Pagination.
 *
 * @author Huy Dang
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pagination {
    private Integer page;

    private Integer perPage;

    private Integer lastPage;

    private Long totalElements;
}
